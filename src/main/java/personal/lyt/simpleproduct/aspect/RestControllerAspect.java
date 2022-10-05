package personal.lyt.simpleproduct.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Slf4j
@Component
public class RestControllerAspect {

    @Before("execution(* personal.lyt.simpleproduct.controller.SimpleController.*(..))")
    public void cut(JoinPoint joinPoint){
        log.info("controller cut begin");
        RequestAttributes context = RequestContextHolder.currentRequestAttributes();
        ServletRequestAttributes attributes = (ServletRequestAttributes) context;
        // 获取主线程中的请求信息
        RequestContextHolder.setRequestAttributes(context,true);
        HttpServletRequest request = attributes.getRequest();
        log.info(String.valueOf(request.hashCode()));
        // 存储参数
        request.setAttribute("common", joinPoint.getArgs()[0]);
    }
}
