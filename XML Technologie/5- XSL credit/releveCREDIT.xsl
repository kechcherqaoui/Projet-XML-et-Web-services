<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    <xsl:template match="/">
        <html>
            <head>
                <title>Releve - </title>
            </head>
            <body>
                <xsl:for-each select="/releve">
                    
                    <center>
                        <h2>RIB : <xsl:value-of select="@RIB"/></h2>
                        <h3>Solde : <xsl:value-of select="/releve/solde"/></h3>
                        <h3>
                            opérations entre : 
                            <xsl:value-of select="/releve/operations/@dateDebut"/> 
                            et 
                            <xsl:value-of select="/releve/operations/@dateFin"/>
                        </h3>
                    </center>
                    <center>
                        <table border="1px" width="75%">
                            <tr>
                                <th>type</th>
                                <th>date</th>
                                <th>montant</th>
                                <th>description</th>
                            </tr>
                            <xsl:for-each select="/releve/operations/operation[@type='CREDIT']">
                                <tr>
                                    <td><xsl:value-of select="@type"/></td>
                                    <td><xsl:value-of select="@date"/></td>
                                    <td><xsl:value-of select="@description"/></td>
                                    <td><xsl:value-of select="@montant"/></td>
                                </tr>
                            </xsl:for-each>
                        </table>
                    </center>
                    
                    <h3 style="margin-left:250px;">Date Releve : <xsl:value-of select="/releve/dateReleve"/></h3>
                </xsl:for-each> 
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>