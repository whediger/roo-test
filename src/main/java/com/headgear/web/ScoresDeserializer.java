package com.headgear.web;
import com.headgear.Scores;
import com.headgear.service.api.ScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ScoresDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Scores.class)
public class ScoresDeserializer extends JsonObjectDeserializer<Scores> {

    /**
     * TODO Auto-generated field documentation
     *
     */
    public ScoresService scoresService;

    /**
     * TODO Auto-generated field documentation
     *
     */
    public ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param scoresService
     * @param conversionService
     */
    @Autowired
    public ScoresDeserializer(ScoresService scoresService, ConversionService conversionService) {
        this.scoresService = scoresService;
        this.conversionService = conversionService;
    }
}
