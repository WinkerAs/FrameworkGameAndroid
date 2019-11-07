package com.example.myapplication.framework;

import android.content.res.AssetManager;
import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class AndroidFileIO implements FileIO {
    AssetManager assets;
    String externalStoragaPath;

    public AndroidFileIO(AssetManager assets){
        this.assets = assets;
        this.externalStoragaPath = Environment.getExternalStorageDirectory()
                .getAbsolutePath() + File.separator;
    }

    @Override
    public InputStream readAsset(String fileName) throws IOException{
        return assets.open(fileName);
    }

    @Override
    public InputStream readFile(String fileName) throws IOException{
        return new FileInputStream(externalStoragaPath + fileName);
    }

    @Override
    public OutputStream writeFile(String fileName) throws IOException{
        return new FileOutputStream(externalStoragaPath + fileName);
    }
}
