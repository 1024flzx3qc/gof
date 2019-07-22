import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 由数据表生成对应的实体类，接口，mapper文件
 * @Auther: ZJZ
 * @Date: 2019.05
 * @Version: 1.0
 */
public class Mbg {
	@Test
	public void create() throws Exception {
		List<String> warnings = new ArrayList<String>();
		// File 的相对路径是以工程为路径的
		File configFile = new File("src/test/resources/mbg.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(true);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
	}
}
