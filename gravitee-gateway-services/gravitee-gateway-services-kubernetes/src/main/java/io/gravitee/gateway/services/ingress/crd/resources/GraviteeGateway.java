/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.gateway.services.ingress.crd.resources;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * @author Eric LELEU (eric.leleu at graviteesource.com)
 * @author GraviteeSource Team
 */
public class GraviteeGateway extends CustomResource implements Namespaced {
    private GraviteeGatewaySpec spec;

    public GraviteeGatewaySpec getSpec() {
        return spec;
    }

    public void setSpec(GraviteeGatewaySpec spec) {
        this.spec = spec;
    }

    @Override
    public ObjectMeta getMetadata() {
        return super.getMetadata();
    }

    @Override
    public String getApiVersion() {
        return "gravitee.io/v1alpha1";
    }

    @Override
    public String toString() {
        return "GraviteeGateway{" +
                "apiVersion='" + getApiVersion() + "'" +
                ", metadata=" + getMetadata() +
                ", spec=" + spec +
                '}';
    }
}