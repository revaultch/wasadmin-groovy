/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a new self-signed certificate and store it in a key store.
*/
@Generated("with GenerateAdminCommands")
class CreateAuditSelfSignedCertificateCmd extends AdminCmd<Void> {
    CreateAuditSelfSignedCertificateCmd() {
        super("createAuditSelfSignedCertificate")
    }

    /**
     * Specifies the unique name to identify the key store.
     */
    def 'keyStoreName'(String value) {
        parameter("keyStoreName", value)
    }

    /**
     * Specifies the scope of the key store.
     */
    def 'keyStoreScope'(String value) {
        parameter("keyStoreScope", value)
    }

    /**
     * Certificate alias name.
     */
    def 'certificateAlias'(String value) {
        parameter("certificateAlias", value)
    }

    /**
     * Specifies the version of the personal certificate.
     */
    def 'certificateVersion'(String value) {
        parameter("certificateVersion", value)
    }

    /**
     * Specifies the size used by the private key of the personal certificate.
     */
    def 'certificateSize'(Integer value) {
        parameter("certificateSize", value)
    }

    /**
     * Specifies the common name portion of the distinguished name (DN).
     */
    def 'certificateCommonName'(String value) {
        parameter("certificateCommonName", value)
    }

    /**
     * Specifies the organization portion of the distinguished name.
     */
    def 'certificateOrganization'(String value) {
        parameter("certificateOrganization", value)
    }

    /**
     * Specifies the organization unit portion of the distinguished name.
     */
    def 'certificateOrganizationalUnit'(String value) {
        parameter("certificateOrganizationalUnit", value)
    }

    /**
     * Specifies the locality portion of the distinguished name.
     */
    def 'certificateLocality'(String value) {
        parameter("certificateLocality", value)
    }

    /**
     * Specifies the state portion of the distinguished name.
     */
    def 'certificateState'(String value) {
        parameter("certificateState", value)
    }

    /**
     * Specifies the zip code portion of the distinguished name
     */
    def 'certificateZip'(String value) {
        parameter("certificateZip", value)
    }

    /**
     * Specifies the country portion of the distinguished name.
     */
    def 'certificateCountry'(String value) {
        parameter("certificateCountry", value)
    }

    /**
     * Specifies the length in days which the certificate will be valid.
     */
    def 'certificateValidDays'(Integer value) {
        parameter("certificateValidDays", value)
    }

}
