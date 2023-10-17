package ps.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ps.demo.common.BaseResponse;
import ps.demo.common.MyBaseController;
import ps.demo.dto.AddToCartDto;
import ps.demo.dto.AddToCartResponse;
import ps.demo.service.JdbcTemplateService;

@Slf4j
@RestController
@RequestMapping("/jdbc")
public class JdbcTemplateController extends MyBaseController {

    @Autowired
    private JdbcTemplateService jdbcTemplateService;

    @Operation(summary = "JdbcTemplate snd database to create table")
    @PostMapping("/create-table")
    public BaseResponse createTable() {
        Long key = jdbcTemplateService.createTable();
        log.info("JdbcTemplateService created table and insert data id={}", key);
        return BaseResponse.success();
    }

}
