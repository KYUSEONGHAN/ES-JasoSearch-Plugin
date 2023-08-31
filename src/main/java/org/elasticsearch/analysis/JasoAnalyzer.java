package org.elasticsearch.analysis;

import org.apache.lucene.analysis.Analyzer;

/**
 * JasoSearchAnalyzer
 */
public class JasoAnalyzer extends Analyzer {
    public JasoAnalyzer() {
    }

    @Override
    protected Analyzer.TokenStreamComponents createComponents(final String fieldName) {
        return new Analyzer.TokenStreamComponents(new JasoTokenizer(TokenizerConfig.create("jaso_analyzer")));
    }
}