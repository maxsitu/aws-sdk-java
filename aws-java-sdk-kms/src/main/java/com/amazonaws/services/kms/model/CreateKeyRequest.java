/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.kms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.kms.AWSKMS#createKey(CreateKeyRequest) CreateKey operation}.
 * <p>
 * Creates a customer master key. Customer master keys can be used to
 * encrypt small amounts of data (less than 4K) directly, but they are
 * most commonly used to encrypt or envelope data keys that are then used
 * to encrypt customer data. For more information about data keys, see
 * GenerateDataKey and GenerateDataKeyWithoutPlaintext.
 * </p>
 *
 * @see com.amazonaws.services.kms.AWSKMS#createKey(CreateKeyRequest)
 */
public class CreateKeyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Policy to be attached to the key. This is required and delegates back
     * to the account. The key is the root of trust.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     */
    private String policy;

    /**
     * Description of the key. We recommend that you choose a description
     * that helps your customer decide whether the key is appropriate for a
     * task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     */
    private String description;

    /**
     * Specifies the intended use of the key. Currently this defaults to
     * ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     * supported.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     */
    private String keyUsage;

    /**
     * Policy to be attached to the key. This is required and delegates back
     * to the account. The key is the root of trust.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return Policy to be attached to the key. This is required and delegates back
     *         to the account. The key is the root of trust.
     */
    public String getPolicy() {
        return policy;
    }
    
    /**
     * Policy to be attached to the key. This is required and delegates back
     * to the account. The key is the root of trust.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param policy Policy to be attached to the key. This is required and delegates back
     *         to the account. The key is the root of trust.
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }
    
    /**
     * Policy to be attached to the key. This is required and delegates back
     * to the account. The key is the root of trust.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param policy Policy to be attached to the key. This is required and delegates back
     *         to the account. The key is the root of trust.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateKeyRequest withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Description of the key. We recommend that you choose a description
     * that helps your customer decide whether the key is appropriate for a
     * task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @return Description of the key. We recommend that you choose a description
     *         that helps your customer decide whether the key is appropriate for a
     *         task.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Description of the key. We recommend that you choose a description
     * that helps your customer decide whether the key is appropriate for a
     * task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @param description Description of the key. We recommend that you choose a description
     *         that helps your customer decide whether the key is appropriate for a
     *         task.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Description of the key. We recommend that you choose a description
     * that helps your customer decide whether the key is appropriate for a
     * task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @param description Description of the key. We recommend that you choose a description
     *         that helps your customer decide whether the key is appropriate for a
     *         task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateKeyRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Specifies the intended use of the key. Currently this defaults to
     * ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     * supported.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @return Specifies the intended use of the key. Currently this defaults to
     *         ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     *         supported.
     *
     * @see KeyUsageType
     */
    public String getKeyUsage() {
        return keyUsage;
    }
    
    /**
     * Specifies the intended use of the key. Currently this defaults to
     * ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     * supported.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @param keyUsage Specifies the intended use of the key. Currently this defaults to
     *         ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     *         supported.
     *
     * @see KeyUsageType
     */
    public void setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
    }
    
    /**
     * Specifies the intended use of the key. Currently this defaults to
     * ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     * supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @param keyUsage Specifies the intended use of the key. Currently this defaults to
     *         ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     *         supported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see KeyUsageType
     */
    public CreateKeyRequest withKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
        return this;
    }

    /**
     * Specifies the intended use of the key. Currently this defaults to
     * ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     * supported.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @param keyUsage Specifies the intended use of the key. Currently this defaults to
     *         ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     *         supported.
     *
     * @see KeyUsageType
     */
    public void setKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
    }
    
    /**
     * Specifies the intended use of the key. Currently this defaults to
     * ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     * supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @param keyUsage Specifies the intended use of the key. Currently this defaults to
     *         ENCRYPT/DECRYPT, and only symmetric encryption and decryption are
     *         supported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see KeyUsageType
     */
    public CreateKeyRequest withKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPolicy() != null) sb.append("Policy: " + getPolicy() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getKeyUsage() != null) sb.append("KeyUsage: " + getKeyUsage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getKeyUsage() == null) ? 0 : getKeyUsage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateKeyRequest == false) return false;
        CreateKeyRequest other = (CreateKeyRequest)obj;
        
        if (other.getPolicy() == null ^ this.getPolicy() == null) return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getKeyUsage() == null ^ this.getKeyUsage() == null) return false;
        if (other.getKeyUsage() != null && other.getKeyUsage().equals(this.getKeyUsage()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateKeyRequest clone() {
        
            return (CreateKeyRequest) super.clone();
    }

}
    