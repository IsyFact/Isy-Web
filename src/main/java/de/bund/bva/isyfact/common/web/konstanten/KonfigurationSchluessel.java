/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * The Federal Office of Administration (Bundesverwaltungsamt, BVA)
 * licenses this file to you under the Apache License, Version 2.0 (the
 * License). You may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package de.bund.bva.isyfact.common.web.konstanten;

/**
 * Konstantenklasse für Konfigurationsschlüssel.
 *
 */
public abstract class KonfigurationSchluessel {

    /**
     * Der zu inkludierende Nutzerbereich.
     */
    public static final String GUI_HEADER_NUTZERBEREICH_XHTML_SRC = "gui.header.nutzerbereich.xhtml.src";

    /**
     * Die erzwungene Sprache für Maskentexte, beispielsweise nur Deutsch.
     */
    public static final String GUI_LANGUAGE_FORCED_LOCALE = "gui.language.forced.locale";

    /**
     * Die Systemversion.
     */
    public static final String SYSTEM_VERSION = "system.version";

    /**
     * Der Systemname.
     */
    public static final String SYSTEM_NAME = "system.name";

    /**
     * Ob die Versionsnummer im Seitentitel angezeigt werden soll.
     */
    public static final String GUI_VERSIONSANZEIGE_SEITENTITEL_AKTIV =
        "gui.versionsanzeige.seitentitel.aktiv";

    /**
     * Der relative Pfad zum Logo, das im Header rechts angezeigt werden soll. Bsp.:
     * /resources/img/logo-rechts.png
     */
    public static final String GUI_HEADER_LOGO_RECHTS_PFAD = "gui.header.logo.rechts.pfad";

    /**
     * Der relative Pfad zum Logo, das im Header links angezeigt werden soll. Bsp.:
     * /resources/img/logo-links.png
     */
    public static final String GUI_HEADER_LOGO_LINKS_PFAD = "gui.header.logo.links.pfad";

    /**
     * Der Text, der im span neben dem rechten Logo angezeigt werden soll.
     */
    public static final String GUI_HEADER_TEXT_LOGO_RECHTS = "gui.header.text.logo.rechts";

}
