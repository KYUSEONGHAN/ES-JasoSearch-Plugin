package org.elasticsearch.analysis;

/**
 * 토크나이저 옵션
 */
public class TokenizerConfig {
    // 한영오타 토큰 추출 여부 변수
    // 한규성 -> gksrbtjd
    // java -> ㅓㅁㅍㅏ
    public static final boolean MISTYPE = false;

    // 초성검색을 위한 토큰 추출 여부 변수
    // 한규성 -> ㅎㄱㅅ
    public static final boolean CHOSUNG = false;

    private boolean mistype = MISTYPE;
    private boolean chosung = CHOSUNG;

    private String name = null;

    public static TokenizerConfig create(String name) {
        return new TokenizerConfig(name);
    }

    private TokenizerConfig(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMistype() {
        return mistype;
    }

    public void setMistype(boolean mistype) {
        this.mistype = mistype;
    }

    public boolean isChosung() {
        return chosung;
    }

    public void setChosung(boolean chosung) {
        this.chosung = chosung;
    }
}
