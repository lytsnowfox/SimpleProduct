package personal.lyt.simpleproduct.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import personal.lyt.simpleproduct.domain.Param;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Slf4j
@Component
public class ServiceContextAspect {

    @Before("execution(* personal.lyt.simpleproduct.service.SimpleService.*(..))")
    public void cut(){
        log.info("service cut begin");
        // 读取参数
        RequestAttributes context = RequestContextHolder.currentRequestAttributes();
        ServletRequestAttributes attributes = (ServletRequestAttributes) context;
        HttpServletRequest request = attributes.getRequest();
        log.info(String.valueOf(request.hashCode()));
        Param p = (Param) request.getAttribute("common");
        p.setP3("param3");
    }

}
