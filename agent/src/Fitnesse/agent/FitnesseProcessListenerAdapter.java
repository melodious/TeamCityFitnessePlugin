/*
 * Copyright 2000-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package Fitnesse.agent;

import Fitnesse.common.Util;
import jetbrains.buildServer.agent.runner.ProcessListenerAdapter;
import jetbrains.buildServer.log.Loggers;
import org.jetbrains.annotations.NotNull;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: Advard
 * Date: 25.03.12
 * Time: 20:40
 * To change this template use File | Settings | File Templates.
 */
public class FitnesseProcessListenerAdapter extends ProcessListenerAdapter{

    @Override
    public void processStarted(@NotNull final String programCommandLine, @NotNull final File workingDirectory) {
        Loggers.AGENT.info("Plugin '" + Util.NAME + "'  processStarted  cmdline '"+programCommandLine+"'");
    }

    @Override
    public void processFinished(final int exitCode) {
        Loggers.AGENT.info("Plugin '" + Util.NAME + "'  processFinished  with exit code  '"+exitCode+"'");
    }

}