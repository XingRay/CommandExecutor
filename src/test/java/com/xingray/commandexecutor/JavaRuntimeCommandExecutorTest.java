package com.xingray.commandexecutor;

import org.junit.jupiter.api.Test;

import java.nio.charset.Charset;

class JavaRuntimeCommandExecutorTest {

    @Test
    void executeSplitCmd() throws Exception {
        JavaRuntimeCommandExecutor executor = new JavaRuntimeCommandExecutor(Charset.forName("GBK"), System.out::println);

        CommandResult result = executor.execute("java -version");
        int exitValue = result.getExitValue();
        System.out.println(exitValue);
        assert exitValue == 0;
    }
}