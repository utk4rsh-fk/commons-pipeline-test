package com.fk;

import org.apache.commons.pipeline.StageException;
import org.apache.commons.pipeline.stage.BaseStage;
import org.apache.commons.pipeline.validation.ConsumedTypes;
import org.apache.commons.pipeline.validation.ProducedTypes;

@ConsumedTypes(StageObject.class)
@ProducedTypes(StageObject.class)
public class Tokenizer extends BaseStage {

    public void preprocess() throws StageException {
        System.out.println("PreProcessing in " + Tokenizer.class.getSimpleName());
    }

    public void process(Object o) throws StageException {
        StageObject stageObject = (StageObject) o;
        String[] tokens = stageObject.getInputText().split(" ");
        stageObject.setTokenizerOutput(String.join(" ", tokens));
        System.out.println("Processing in " + Tokenizer.class.getSimpleName() + " with output " + stageObject);
        super.process(stageObject);
    }

    public void postprocess() throws StageException {
    }

    public void release() {

    }
}
