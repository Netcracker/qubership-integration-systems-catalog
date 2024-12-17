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

package org.qubership.integration.platform.designtime.catalog.rest.v1.dto.element;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@Schema(description = "Change element request object")
public class PatchElementRequest {
    @Schema(description = "Element name")
    private String name;
    @Schema(description = "Element description")
    private String description;
    @Schema(description = "Inner element type")
    private String type;
    @Schema(description = "Parent element (container) id")
    private String parentElementId;
    @Schema(description = "Map of properties for the element")
    private Map<String, Object> properties = new HashMap<>();
}