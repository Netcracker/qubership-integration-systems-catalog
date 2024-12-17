/*
 * Copyright 2024-2025 NetCracker Technology Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.qubership.integration.platform.designtime.catalog.rest.v1.dto.chain.logging.properties;

import org.qubership.integration.platform.catalog.model.deployment.properties.DeploymentRuntimeProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.annotation.Nullable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(description = "Chain logging deployment properties")
public class ChainLoggingPropertiesSet {
    @Schema(description = "Default logging deployment properties")
    private DeploymentRuntimeProperties fallbackDefault;
    @Nullable
    @Schema(description = "Consul default logging deployment properties")
    private DeploymentRuntimeProperties consulDefault;
    @Nullable
    @Schema(description = "Custom logging deployment properties")
    private DeploymentRuntimeProperties custom;
}