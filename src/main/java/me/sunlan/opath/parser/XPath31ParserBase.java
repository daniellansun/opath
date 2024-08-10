/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package me.sunlan.opath.parser;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

public abstract class XPath31ParserBase extends Parser {
    protected XPath31ParserBase(TokenStream input) {
        super(input);
    }

    protected boolean isFuncCall() {
        return !(
                getInputStream().LA(1) == XPath31Parser.KW_ARRAY
                        || getInputStream().LA(1) == XPath31Parser.KW_ATTRIBUTE
                        || getInputStream().LA(1) == XPath31Parser.KW_COMMENT
                        || getInputStream().LA(1) == XPath31Parser.KW_DOCUMENT_NODE
                        || getInputStream().LA(1) == XPath31Parser.KW_ELEMENT
                        || getInputStream().LA(1) == XPath31Parser.KW_EMPTY_SEQUENCE
                        || getInputStream().LA(1) == XPath31Parser.KW_FUNCTION
                        || getInputStream().LA(1) == XPath31Parser.KW_IF
                        || getInputStream().LA(1) == XPath31Parser.KW_ITEM
                        || getInputStream().LA(1) == XPath31Parser.KW_MAP
                        || getInputStream().LA(1) == XPath31Parser.KW_NAMESPACE_NODE
                        || getInputStream().LA(1) == XPath31Parser.KW_NODE
                        || getInputStream().LA(1) == XPath31Parser.KW_PROCESSING_INSTRUCTION
                        || getInputStream().LA(1) == XPath31Parser.KW_SCHEMA_ATTRIBUTE
                        || getInputStream().LA(1) == XPath31Parser.KW_SCHEMA_ELEMENT
                        || getInputStream().LA(1) == XPath31Parser.KW_TEXT
        );
    }
}
