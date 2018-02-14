package com.fk;

import org.apache.commons.pipeline.StageException;
import org.apache.commons.pipeline.stage.BaseStage;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class CaseCorrector extends BaseStage {

    public void preprocess() throws StageException {
        System.out.println("PreProcessing in " + CaseCorrector.class.getSimpleName());
    }

    public void process(Object o) throws StageException {
        StageObject stageObject = (StageObject) o;
        Collection<String> tokens = Arrays.asList(stageObject.getPunctuationCorrectorOutput().split(" "));
        String result = tokens.stream().map(token -> token.toLowerCase()).collect(Collectors.joining(" "));
        stageObject.setCaseCorrectorOutput(result);
        System.out.println("Processing in " + CaseCorrector.class.getSimpleName() + " with output " + stageObject);
        super.process(o);
    }

    public void postprocess() throws StageException {
    }

    public void release() {

    }
}
