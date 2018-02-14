package com.fk;

import org.apache.commons.pipeline.StageException;
import org.apache.commons.pipeline.stage.BaseStage;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class PunctuationCorrector extends BaseStage {

    public void preprocess() throws StageException {
        System.out.println("PreProcessing in " + PunctuationCorrector.class.getSimpleName());
    }

    public void process(Object o) throws StageException {
        StageObject stageObject = (StageObject) o;
        Collection<String> tokens = Arrays.asList(stageObject.getTokenizerOutput().split(" "));
        String result = tokens.stream().filter(token -> !token.equals("!")).collect(Collectors.joining(" "));
        stageObject.setPunctuationCorrectorOutput(result);
        System.out.println("Processing in " + PunctuationCorrector.class.getSimpleName() + " with output " + stageObject);
        super.process(o);
    }

    public void postprocess() throws StageException {
    }

    public void release() {

    }
}
