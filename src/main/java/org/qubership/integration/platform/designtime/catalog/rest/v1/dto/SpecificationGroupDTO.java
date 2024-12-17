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

package org.qubership.integration.platform.designtime.catalog.rest.v1.dto;

import org.qubership.integration.platform.catalog.model.dto.BaseResponse;
import org.qubership.integration.platform.catalog.model.dto.user.UserDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "Specification group")
public class SpecificationGroupDTO {
    @Schema(description = "Id")
    private String id;
    @Schema(description = "Name")
    private String name;
    @Schema(description = "Service id")
    private String systemId;
    @Schema(description = "Url on target service (in case of discovered specification)")
    private String url;
    @Schema(description = "Whether update on next discovery enabled for that particular specification")
    private boolean synchronization;
    @Schema(description = "Timestamp of object creation")
    private Long createdWhen;
    @Schema(description = "User who created that object")
    private UserDTO createdBy;
    @Schema(description = "Timestamp of object last modification")
    private Long modifiedWhen;
    @Schema(description = "User who last modified that object")
    private UserDTO modifiedBy;
    @Schema(description = "List of contained specifications")
    private List<SystemModelBaseDTO> specifications;
    @Schema(description = "List of chains that is using current specification group")
    private List<BaseResponse> chains;
    @Schema(description = "Labels assigned to the specification group")
    private List<SpecificationGroupLabelDTO> labels;
}
