package onboarding;

import onboarding.Problem5.CURRENCY;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Problem5Test {
	@Nested
	class countMaxNumberOfCurrenciesTest {
		@ParameterizedTest(name = "{0}원에서 50000원권은 {1}개가 나온다")
		@CsvSource(value = {"52943:1", "49999:0", "50001:1", "99999:1", "0:0", "1000000:20"}, delimiter = ':')
		void at50000WonTest(int money, int expected) {
			// given : 50000 원이라는 화폐가 주어질 때
			final CURRENCY W_50000 = CURRENCY.W_50000;

			// when : money 에서 50000 원은 최대 몇개까지 만들어질 수 있을까
			int result = Problem5.countMaxNumberOfCurrencies(W_50000, money);

			// then : 만들어지는 50000 원권의 개수를 확인
			assertThat(result).isEqualTo(expected);
		}

		@ParameterizedTest(name = "{0}원에서 10000원권은 {1}개가 나온다")
		@CsvSource(value = {"52943:5", "49999:4", "50001:5", "99999:9", "0:0", "1000000:100"}, delimiter = ':')
		void at10000WonTest(int money, int expected) {
			// given : 10000 원이라는 화폐가 주어질 때
			final CURRENCY W_10000 = CURRENCY.W_10000;

			// when : money 에서 10000 원은 최대 몇개까지 만들어질 수 있을까
			int result = Problem5.countMaxNumberOfCurrencies(W_10000, money);

			// then : 만들어지는 10000 원권의 개수를 확인
			assertThat(result).isEqualTo(expected);
		}

		@ParameterizedTest(name = "{0}원에서 5000원권은 {1}개가 나온다")
		@CsvSource(value = {"52943:10", "49999:9", "50001:10", "99999:19", "0:0", "1000000:200"}, delimiter = ':')
		void at5000WonTest(int money, int expected) {
			// given : 5000 원이라는 화폐가 주어질 때
			final CURRENCY W_5000 = CURRENCY.W_5000;

			// when : money 에서 5000 원은 최대 몇개까지 만들어질 수 있을까
			int result = Problem5.countMaxNumberOfCurrencies(W_5000, money);

			// then : 만들어지는 5000 원권의 개수를 확인
			assertThat(result).isEqualTo(expected);
		}

		@ParameterizedTest(name = "{0}원에서 1000원권은 {1}개가 나온다")
		@CsvSource(value = {"52943:52", "49999:49", "50001:50", "99999:99", "0:0", "1000000:1000"}, delimiter = ':')
		void at1000WonTest(int money, int expected) {
			// given : 1000 원이라는 화폐가 주어질 때
			final CURRENCY W_1000 = CURRENCY.W_1000;

			// when : money 에서 1000 원은 최대 몇개까지 만들어질 수 있을까
			int result = Problem5.countMaxNumberOfCurrencies(W_1000, money);

			// then : 만들어지는 1000 원권의 개수를 확인
			assertThat(result).isEqualTo(expected);
		}

		@ParameterizedTest(name = "{0}원에서 500원권은 {1}개가 나온다")
		@CsvSource(value = {"52943:105", "49999:99", "50001:100", "99999:199", "0:0", "1000000:2000"}, delimiter = ':')
		void at500WonTest(int money, int expected) {
			// given : 500 원이라는 화폐가 주어질 때
			final CURRENCY W_500 = CURRENCY.W_500;

			// when : money 에서 500 원은 최대 몇개까지 만들어질 수 있을까
			int result = Problem5.countMaxNumberOfCurrencies(W_500, money);

			// then : 만들어지는 500 원권의 개수를 확인
			assertThat(result).isEqualTo(expected);
		}

		@ParameterizedTest(name = "{0}원에서 100원권은 {1}개가 나온다")
		@CsvSource(value = {"52943:529", "49999:499", "50001:500", "99999:999", "0:0", "1000000:10000"}, delimiter = ':')
		void at100WonTest(int money, int expected) {
			// given : 100 원이라는 화폐가 주어질 때
			final CURRENCY W_100 = CURRENCY.W_100;

			// when : money 에서 100 원은 최대 몇개까지 만들어질 수 있을까
			int result = Problem5.countMaxNumberOfCurrencies(W_100, money);

			// then : 만들어지는 100 원권의 개수를 확인
			assertThat(result).isEqualTo(expected);
		}

		@ParameterizedTest(name = "{0}원에서 50원권은 {1}개가 나온다")
		@CsvSource(value = {"52943:1058", "49999:999", "50001:1000", "99999:1999", "0:0", "1000000:20000"}, delimiter = ':')
		void at50WonTest(int money, int expected) {
			// given : 50 원이라는 화폐가 주어질 때
			final CURRENCY W_50 = CURRENCY.W_50;

			// when : money 에서 50 원은 최대 몇개까지 만들어질 수 있을까
			int result = Problem5.countMaxNumberOfCurrencies(W_50, money);

			// then : 만들어지는 50 원권의 개수를 확인
			assertThat(result).isEqualTo(expected);
		}

		@ParameterizedTest(name = "{0}원에서 10원권은 {1}개가 나온다")
		@CsvSource(value = {"52943:5294", "49999:4999", "50001:5000", "99999:9999", "0:0", "1000000:100000"}, delimiter = ':')
		void at10WonTest(int money, int expected) {
			// given : 10 원이라는 화폐가 주어질 때
			final CURRENCY W_10 = CURRENCY.W_10;

			// when : money 에서 10 원은 최대 몇개까지 만들어질 수 있을까
			int result = Problem5.countMaxNumberOfCurrencies(W_10, money);

			// then : 만들어지는 10 원권의 개수를 확인
			assertThat(result).isEqualTo(expected);
		}

		@ParameterizedTest(name = "{0}원에서 1원권은 {1}개가 나온다")
		@CsvSource(value = {"52943:52943", "49999:49999", "50001:50001", "99999:99999", "0:0", "1000000:1000000"}, delimiter = ':')
		void at1WonTest(int money, int expected) {
			// given : 1 원이라는 화폐가 주어질 때
			final CURRENCY W_1 = CURRENCY.W_1;

			// when : money 에서 1 원은 최대 몇개까지 만들어질 수 있을까
			int result = Problem5.countMaxNumberOfCurrencies(W_1, money);

			// then : 만들어지는 1 원권의 개수를 확인
			assertThat(result).isEqualTo(expected);
		}
	}

}