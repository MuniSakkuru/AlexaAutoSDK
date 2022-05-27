/*
 * Copyright 2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *     http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazon.alexa.auto.app.dependencies;

import com.amazon.alexa.auto.app.audio.AudioIOService;

import dagger.Subcomponent;

@ServiceScope
@Subcomponent(modules = AudioIOModule.class)
public interface AudioIOComponent {
    /**
     * Inject to @{link AudioIOService}.
     *
     * @param service Object whose dependencies are resolved by dagger.
     */
    void inject(AudioIOService service);
}