/*
 * Jitsi, the OpenSource Java VoIP and Instant Messaging client.
 *
 * Copyright @ 2015 Atlassian Pty Ltd
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
package net.java.sip.communicator.plugin.otr;

import net.java.otr4j.crypto.DSAKeyPair;
import net.java.sip.communicator.plugin.otr.OtrContactManager.OtrContact;
import net.java.sip.communicator.service.protocol.AccountID;
import net.java.sip.communicator.service.protocol.Contact;

import java.security.interfaces.DSAPublicKey;
import java.util.List;

/**
 *
 * @author George Politis
 *
 */
public interface ScOtrKeyManager
{

    public abstract void addListener(ScOtrKeyManagerListener l);

    public abstract void removeListener(ScOtrKeyManagerListener l);

    public abstract void verify(OtrContact contact, String fingerprint);

    public abstract void unverify(OtrContact contact, String fingerprint);

    public abstract boolean isVerified(Contact contact, String fingerprint);

    public abstract String getFingerprintFromPublicKey(DSAPublicKey pubKey);

    public abstract List<String> getAllRemoteFingerprints(Contact contact);

    public abstract String getLocalFingerprint(AccountID account);

    public abstract byte[] getLocalFingerprintRaw(AccountID account);

    public abstract void saveFingerprint(Contact contact, String fingerprint);

    public abstract DSAKeyPair loadKeyPair(AccountID accountID);

    public abstract void generateKeyPair(AccountID accountID);

}
