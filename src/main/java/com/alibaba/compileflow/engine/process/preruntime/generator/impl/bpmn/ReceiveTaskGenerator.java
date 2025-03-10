/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.compileflow.engine.process.preruntime.generator.impl.bpmn;

import com.alibaba.compileflow.engine.definition.bpmn.ReceiveTask;
import com.alibaba.compileflow.engine.process.preruntime.generator.code.CodeTargetSupport;
import com.alibaba.compileflow.engine.process.preruntime.generator.constansts.SystemEventConstants;
import com.alibaba.compileflow.engine.runtime.impl.AbstractProcessRuntime;

/**
 * @author yusu
 */
public class ReceiveTaskGenerator extends AbstractBpmnInOutActionNodeGenerator<ReceiveTask> {

    public ReceiveTaskGenerator(AbstractProcessRuntime runtime,
                                ReceiveTask flowNode) {
        super(runtime, flowNode);
    }

    @Override
    public void generateCode(CodeTargetSupport codeTargetSupport) {
        generateCode(SystemEventConstants.CONTINUE_EVENT, codeTargetSupport);
    }

}
