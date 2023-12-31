package ps.demo.dto;

import lombok.*;
import ps.demo.common.BaseResponse;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RemoveFromCartResponse extends BaseResponse {

    private RemoveFromCartResponse.Data data;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @ToString
    @Builder
    public static class Data {
        private Long cartId;
    }

}
