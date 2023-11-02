package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class RandomLottoNumberGenerator {

    public static final int LOTTO_MIN_NUMBER = 1;
    public static final int LOTTO_MAX_NUMBER = 45;
    private static final int LOTTO_NUMBER_COUNT = 6;

    public Set<Integer> generateNumbers() {
        List<Integer> randomNumbers = Randoms.pickUniqueNumbersInRange(LOTTO_MIN_NUMBER, LOTTO_MAX_NUMBER, LOTTO_NUMBER_COUNT);
        return new TreeSet<>(randomNumbers);
    }
}
