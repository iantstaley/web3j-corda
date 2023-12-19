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
package org.web3j.corda.model.core.flows

import javax.annotation.Generated

/**
 *
 * @param statesToConsume
 * @param transactionId Base 58 Encoded Secure Hash
 */
@Generated(
    value = ["org.web3j.corda.codegen.CorDappClientGenerator"],
    date = "2019-09-25T12:12:09.608Z"
)
data class NotarisationRequest(
    val statesToConsume: List<org.web3j.corda.model.core.contracts.StateRef>,
    /* Base 58 Encoded Secure Hash */
    val transactionId: String
)
