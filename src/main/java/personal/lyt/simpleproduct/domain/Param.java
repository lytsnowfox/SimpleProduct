package personal.lyt.simpleproduct.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Param implements Serializable {

    private String p1;

    private String p2;

    private String p3;

    @Override
    public String toString() {
        return "Param{" +
                "p1='" + p1 + '\'' +
                ", p2='" + p2 + '\'' +
                ", p3='" + p3 + '\'' +
                '}';
    }
}
