package com.ggs.eduservice.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 *  @Author Starbug
 *  @Date 2020/11/16 21:04
 */
@Component
public class EduConfig {

    /**
     * @Author lhh
     * @Description 逻辑删除组件
     * @Date 2020/11/16 21:05
     **/
    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }

    /**
     * @Author lhh
     * @Description 分页插件
     * @Date 2020/11/16 21:54
     **/
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
