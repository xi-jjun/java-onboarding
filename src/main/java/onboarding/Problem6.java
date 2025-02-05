package onboarding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem6 {
	private static final int START_INDEX_OF_TOKENIZATION = 0;
	private static final int TOKEN_LENGTH = 2;
	private static final int DEFAULT_TOKEN_CNT = 0;

	private static final int DUPLICATE_THRESHOLD = 1;

	static final Map<String, Integer> tokenCounter = new HashMap<>();

	public static List<String> solution(List<List<String>> forms) {
		countAllTokensFromForms(forms);

		return forms.stream()
				.filter(form -> isDuplicated(getNickname(form)))
				.map(form -> getEmail(form))
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}

	public static Set<String> extractTokensFromNicknameWithoutDuplication(String nickname) {
		return IntStream.range(START_INDEX_OF_TOKENIZATION, nickname.length() - 1)
				.mapToObj(start -> nickname.substring(start, start + TOKEN_LENGTH))
				.collect(Collectors.toSet());
	}

	public static void countToken(Set<String> tokens) {
		for (String token : tokens) {
			Integer tokenCount = tokenCounter.getOrDefault(token, DEFAULT_TOKEN_CNT);
			tokenCounter.put(token, tokenCount + 1);
		}
	}

	public static String getEmail(List<String> form) {
		return form.get(0);
	}

	public static String getNickname(List<String> form) {
		return form.get(1);
	}

	public static void countAllTokensFromForms(List<List<String>> forms) {
		forms.stream()
				.map(list -> getNickname(list))
				.map(nickname -> extractTokensFromNicknameWithoutDuplication(nickname))
				.forEach(tokens -> countToken(tokens));
	}

	public static boolean checkDuplication(String token) {
		return tokenCounter.containsKey(token) && tokenCounter.get(token) > DUPLICATE_THRESHOLD;
	}

	public static boolean isDuplicated(String nickname) {
		return IntStream.range(START_INDEX_OF_TOKENIZATION, nickname.length() - 1)
				.mapToObj(start -> nickname.substring(start, start + TOKEN_LENGTH))
				.anyMatch(token -> checkDuplication(token));
	}
}
