package ps.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ps.demo.common.MyBaseResponse;
import ps.demo.common.MyBaseController;
import ps.demo.common.StringDataResponseMy;
import ps.demo.entity.Product;
import ps.demo.service.AsyncService;
import ps.demo.service.CacheService;

import java.util.concurrent.Future;

@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController extends MyBaseController {

    @Autowired
    private CacheService cacheService;

    @Autowired
    private AsyncService asyncService;

    @Operation(summary = "Cache demo get")
    @GetMapping("/cache")
    public MyBaseResponse findProduct(@RequestParam(name = "productId") Long productId) {
        Product product = cacheService.findProductById(productId);
        return StringDataResponseMy.successWithData(product);
    }

    @Operation(summary = "Cache demo delete")
    @DeleteMapping("/cache")
    public MyBaseResponse deleteProduct(@RequestParam(name = "productId") Long productId) {
        cacheService.deleteProductFromCache(productId);
        return MyBaseResponse.success();
    }

    @SneakyThrows
    @Operation(summary = "Asynchronous demo")
    @GetMapping("/async")
    public MyBaseResponse asyncCall(@RequestParam(name = "sleepSeconds") Long sleepSeconds,
                                    @RequestParam(name = "wait") Boolean wait) {
        Future<String> str = asyncService.asyncronizedCall(sleepSeconds);
        if (wait) {
            String result = str.get();
            return StringDataResponseMy.successWithData(result);
        }
        // str.get();
        return StringDataResponseMy.successWithData("You don't wait.");
    }

}
