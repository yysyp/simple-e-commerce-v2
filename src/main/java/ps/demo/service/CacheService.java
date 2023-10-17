package ps.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import ps.demo.entity.Product;
import ps.demo.repository.ProductMapper;

@Slf4j
@Service
@CacheConfig(cacheNames = {"myCache"})
public class CacheService {

    @Autowired
    private ProductMapper productMapper;

    @Cacheable(key = "targetClass + 'product-' +#p0", unless = "#result == null")
    public Product findProductById(Long id) {
        log.info("Actually find product by id, id={}", id);
        Product product = productMapper.selectById(id);
        return product;
    }

    @CacheEvict(value = "myCache", key = "targetClass + 'product-' +#p0")
    public void deleteProductFromCache(Long id) {
        log.info("Delete product id={} from cache", id);
        //productMapper.deleteById(id);
    }


}
