/*
 * Copyright 2019 Web3 Labs Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.web3j.corda.api

import javax.ws.rs.Path
import org.web3j.braid.services.vault.VaultQuery
import org.web3j.corda.model.core.node.services.Vault_Page_net_corda_core_contracts_ContractState

interface VaultResource {

    @get:Path("vaultQuery")
    val queryBy: VaultQueryResource

    @Path("vaultQueryBy")
    fun query(
        query: VaultQuery
    ): Vault_Page_net_corda_core_contracts_ContractState
}
