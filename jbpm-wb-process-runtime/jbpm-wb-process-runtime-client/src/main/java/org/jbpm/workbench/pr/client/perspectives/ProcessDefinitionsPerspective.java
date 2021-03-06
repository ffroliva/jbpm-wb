/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.workbench.pr.client.perspectives;

import javax.enterprise.context.ApplicationScoped;

import org.jbpm.workbench.common.client.PerspectiveIds;
import org.jbpm.workbench.common.client.perspectives.AbstractPerspective;
import org.jbpm.workbench.pr.client.editors.definition.list.ProcessDefinitionListPresenter;
import org.uberfire.client.annotations.WorkbenchPerspective;
import org.uberfire.mvp.PlaceRequest;
import org.uberfire.mvp.impl.DefaultPlaceRequest;

/**
 * A Perspective to show Process Definitions
 */
@ApplicationScoped
@WorkbenchPerspective(identifier = PerspectiveIds.PROCESS_DEFINITIONS)
public class ProcessDefinitionsPerspective extends AbstractPerspective {

    @Override
    public PlaceRequest getPlaceRequest() {
        return new DefaultPlaceRequest(ProcessDefinitionListPresenter.SCREEN_ID);
    }

    @Override
    public String getPerspectiveId() {
        return PerspectiveIds.PROCESS_DEFINITIONS;
    }
}
