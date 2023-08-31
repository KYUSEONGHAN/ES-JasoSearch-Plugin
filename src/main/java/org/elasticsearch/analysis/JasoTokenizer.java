package org.elasticsearch.analysis;

import org.elasticsearch.common.Config;

/**
 * 자소 토크나이저 구현
 */
public final class JasoTokenizer extends BaseTokenizer {

    /**
     * 자소 토크나이저 생성자
     * @param options 토크나이저 옵션
     */
    public JasoTokenizer(TokenizerConfig options) {
        super(options);
    }

    /**
     * Collects only characters which do not satisfy
     * {@link Character#isWhitespace(int)}.
     */
    @Override
    protected boolean isTokenChar(int c) {
        return !isSplit(c);
    }

    /**
     * White Space로 토큰분해
     */
    private boolean isSplit(int c) {
        return (char) c == Config.WHITESPACE_CHAR;
    }
}