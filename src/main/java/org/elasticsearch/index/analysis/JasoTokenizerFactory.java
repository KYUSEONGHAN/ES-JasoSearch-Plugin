package org.elasticsearch.index.analysis;

import org.apache.lucene.analysis.Tokenizer;
import org.elasticsearch.analysis.JasoTokenizer;
import org.elasticsearch.analysis.TokenizerConfig;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.IndexSettings;
import org.elasticsearch.env.Environment;

/**
 * JasoTokenizerFactory
 */
public class JasoTokenizerFactory extends AbstractTokenizerFactory {

    private final TokenizerConfig options;

    public JasoTokenizerFactory(IndexSettings indexSettings,
                                Environment environment,
                                String name,
                                Settings settings) {

        super(indexSettings, settings, name);

        this.options = TokenizerConfig.create(name);
        this.options.setMistype(settings.getAsBoolean("mistype", TokenizerConfig.MISTYPE));
        this.options.setChosung(settings.getAsBoolean("chosung", TokenizerConfig.CHOSUNG));
    }

    @Override
    public Tokenizer create() {
        return new JasoTokenizer(this.options);
    }
}