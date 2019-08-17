package book;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SharesReportTest {

    @Test
    public void testMultiplication() {
        assertThat(new USD(5).times(2)).isEqualTo(10);
    }
}