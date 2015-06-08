package com.aspose.words.examples;/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Words. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */


import java.io.File;

public class Common {

    /**
     * Get the data directory where input and output files are placed
     * @return Path of data directory
     */
    public static String getDataDir() {
        String dataDir = new File(".").getAbsolutePath();
        dataDir = dataDir.substring(0, dataDir.length()-1) + "/data/";

        return dataDir;
    }
}
