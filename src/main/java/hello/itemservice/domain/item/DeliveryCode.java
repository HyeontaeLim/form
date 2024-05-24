package hello.itemservice.domain.item;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Fast: 빠른 배송
 * Normal: 일반 배송
 * Slow: 느린 배송
 *
 */
@Data
public class DeliveryCode {

    private final String code;
    private final String displayName;
}
