package ps.demo.controller;

import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ps.demo.common.MyBaseController;
import ps.demo.common.MyBaseResponse;
import ps.demo.common.MyRestTemplateUtil;
import ps.demo.common.StringDataResponseMy;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/abnml")
public class AbnormalGetWithRequestEndpointController extends MyBaseController {

    @Operation(summary = "Abnormal endpoint GET with requestBody for testing1")
    @GetMapping("/getwithreq1")
    public MyBaseResponse getwithreq1(@RequestBody Map requestBody, HttpServletRequest request) {
        log.info("getwithreq1 requestBody={}, requestParameters={}", requestBody, request.getParameterMap());

//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        ParameterizedTypeReference<String> pType = new ParameterizedTypeReference<String>() {
//        };
//        ResponseEntity<String> responseEntity = MyRestTemplateUtil.getInstance().getWithRequestBodyForObject(
//                "http://localhost:8080/abnml/getwithreq2?user={userId}&age={age}"
//                , headers
//                , "What every this is the Request Body for GET"
//                , pType
//                , ImmutableMap.of("userId", "xiaolong", "age", 12));
//        return StringDataResponseMy.successWithData(responseEntity.getBody());

        String reqBody = new Gson().toJson(ImmutableMap.of("method", "get", "requestBody", "hea你好~"));
        String responseBody = MyRestTemplateUtil.getWithRequestBody("http://localhost:8080/abnml/getwithreq2?user=userId&age=14"
        , reqBody, "UTF-8");
        return StringDataResponseMy.successWithData(responseBody);
    }

    @Operation(summary = "Abnormal endpoint GET with requestBody for testing2")
    @GetMapping("/getwithreq2")
    public MyBaseResponse getwithreq2(@RequestBody Map requestBody, HttpServletRequest request) {
        log.info("getwithreq2 requestBody={}, requestParameters={}", requestBody, request.getParameterMap());

        return StringDataResponseMy.successWithData(ImmutableMap.of("requestBody", requestBody, "parameterMap", request.getParameterMap()));
    }


}
