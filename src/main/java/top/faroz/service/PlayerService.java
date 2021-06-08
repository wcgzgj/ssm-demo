package top.faroz.service;

import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.PrivateKeyResolver;
import top.faroz.pojo.Player;

import java.util.List;

public interface PlayerService {

    List<Player> selectAll();
}
