package template.core.api.response;

import lombok.Data;

@Data
public class ApiResponse {
    private String status;
    private Integer code;
    private Object data;
    
    public ApiResponse() {
    }

    public ApiResponse(String status, Integer code, Object data) {
        this.status = status;
        this.code = code;
        this.data = data;
    }
}
