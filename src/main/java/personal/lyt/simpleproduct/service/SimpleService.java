package personal.lyt.simpleproduct.service;

import personal.lyt.simpleproduct.domain.Param;

public interface SimpleService {

    int process(Param param);

    void asyncProcess(Param param);
}
