package personal.lyt.simpleproduct.service;

import personal.lyt.simpleproduct.domain.Param;

public interface ProxyService {

    int process(Param param);

    int asyncProcess(Param param);

}
