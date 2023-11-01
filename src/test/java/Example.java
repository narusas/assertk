import org.junit.jupiter.api.Test;

import static net.narusas.test.assertk.AssertK.*;

public class Example {
    @Test
    void test1() {

        // Given
        // 사용자가 가입하지 않은 상태에서

        // When
        // 로그인 하면

        // Then
        boolean 로그인_시도_결과= false;
        그렇다면_("가입 되지 않았음").으로_(로그인_시도_결과).는.실패.해야_한다();
    }


}
