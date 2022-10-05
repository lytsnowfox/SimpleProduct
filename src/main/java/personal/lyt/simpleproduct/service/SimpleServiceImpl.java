package personal.lyt.simpleproduct.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import personal.lyt.simpleproduct.domain.Param;

@Service
@Slf4j
public class SimpleServiceImpl implements SimpleService {

    @Override
    public int process(Param param) {
        log.info("SimpleService：" + param.toString());
        return 1;
    }

    @Async
    @Override
    public void asyncProcess(Param param) {
        process(param);
    }

}
