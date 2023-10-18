package ps.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ps.demo.common.MyBaseResponse;
import ps.demo.common.MyBaseController;
import ps.demo.service.JdbcTemplateService;

@Slf4j
@RestController
@RequestMapping("/jdbc")
public class JdbcTemplateController extends MyBaseController {

    @Autowired
    private JdbcTemplateService jdbcTemplateService;

    @Operation(summary = "JdbcTemplate snd database to create table")
    @PostMapping("/create-table")
    public MyBaseResponse createTable() {
        Long key = jdbcTemplateService.createTable();
        log.info("JdbcTemplateService created table and insert data id={}", key);
        return MyBaseResponse.success();
    }

}
