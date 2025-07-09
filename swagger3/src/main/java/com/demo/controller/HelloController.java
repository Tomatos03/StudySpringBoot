package com.demo.controller;

import com.demo.dto.UserDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Tomatos
 * @date : 2025/7/9
 */
// @Tag - 配置UI界面相关信息
@Tag(name = "Hello模块", description = "Hello模块相关描述")
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Operation(
            summary = "Hello Method summary",
            description = "Hello Method description"
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "请求成功"
            ),
            // 设置content为空, 否则会展示相关值
            @ApiResponse(
                    responseCode = "401",
                    description = "未授权",
                    content = @Content()
            ),
            @ApiResponse(
                    responseCode = "403",
                    description = "禁止访问",
                    content = @Content()
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "未找到",
                    content = @Content()
            )
    })
    @GetMapping("call")
    public UserDTO hello() {
        return new UserDTO("Tom", 20);
    }
}