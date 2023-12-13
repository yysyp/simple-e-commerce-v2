package ps.demo.dto;

import lombok.*;
import ps.demo.common.MyBaseResponse;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RemoveFromCartResponse extends MyBaseResponse {

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
