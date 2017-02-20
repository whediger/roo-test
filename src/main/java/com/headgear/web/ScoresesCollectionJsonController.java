package com.headgear.web;
import com.headgear.Scores;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ScoresesCollectionJsonController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Scores.class, type = ControllerType.COLLECTION)
@RooJSON
public class ScoresesCollectionJsonController {
}
