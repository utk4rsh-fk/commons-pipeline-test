package com.fk;

import org.apache.commons.pipeline.Pipeline;
import org.apache.commons.pipeline.Stage;
import org.apache.commons.pipeline.StageDriverFactory;
import org.apache.commons.pipeline.driver.SynchronousStageDriverFactory;
import org.apache.commons.pipeline.validation.ValidationException;

public class PipelineApp {
    public static void main(String[] args) throws ValidationException {

        StageObject stageObject = new StageObject("Hello world! Remove unnecessary punctuations. ! ! ");
        Pipeline pipeline = createPipeline();
        pipeline.getSourceFeeder().feed(stageObject);
        pipeline.run();
    }

    private static Pipeline createPipeline() throws ValidationException {
        Stage tokenizer = new Tokenizer();
        Stage caseCorrector = new CaseCorrector();
        Stage punctuationCorrector = new PunctuationCorrector();
        StageDriverFactory sdf = new SynchronousStageDriverFactory();
        Pipeline instance = new Pipeline();
        instance.addStage(tokenizer, sdf);
        instance.addStage(punctuationCorrector, sdf);
        instance.addStage(caseCorrector, sdf);
        return instance;
    }
}
