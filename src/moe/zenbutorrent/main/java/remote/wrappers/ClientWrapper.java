package moe.zenbutorrent.main.java.remote.wrappers;

import java.io.File;
import java.util.List;

import moe.zenbutorrent.main.java.remote.exceptions.RemoteTorrentConnectionException;
import moe.zenbutorrent.main.java.remote.exceptions.RemoteTorrentUnauthorizedException;
import moe.zenbutorrent.main.java.remote.torrent.RemoteTorrent;

public interface ClientWrapper
{
    public void addTorrent(String url) throws RemoteTorrentConnectionException, RemoteTorrentUnauthorizedException;

    public void addTorrent(File file) throws RemoteTorrentConnectionException, RemoteTorrentUnauthorizedException;

    public void pauseTorrent(RemoteTorrent remoteTorrent) throws RemoteTorrentConnectionException, RemoteTorrentUnauthorizedException;

    public void resumeTorrent(RemoteTorrent remoteTorrent) throws RemoteTorrentConnectionException, RemoteTorrentUnauthorizedException;

    public void deleteTorrent(RemoteTorrent remoteTorrent) throws RemoteTorrentConnectionException, RemoteTorrentUnauthorizedException;

    public void deleteTorrentAndData(RemoteTorrent remoteTorrent) throws RemoteTorrentConnectionException, RemoteTorrentUnauthorizedException;

    public List<? extends RemoteTorrent> getAllTorrents() throws RemoteTorrentConnectionException, RemoteTorrentUnauthorizedException;

    public void updateAllTorrents(List<RemoteTorrent> torrents, Class<? extends RemoteTorrent> c) throws RemoteTorrentConnectionException, RemoteTorrentUnauthorizedException;

    public String getName();
}
