package PPT;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupTest02 {

	public static void main(String[] args) {
		/* main { ��ȣ ���� throws IOException �̷��� �ϸ� try catch �Ƚᵵ��*/
		String url = "https://movie.naver.com/movie/running/current.nhn"; // ũ�Ѹ� �ϰ��� �ϴ� �� ����Ʈ �ּ�
		try {
			Document doc = Jsoup.connect(url).get(); // ������Ʈ�� �����ϱ�
			Elements movielist = doc.select(".lst_detail_t1").select("li");
			// Ŭ���� �̸��� (.) lst_detail_t1 �����ؼ� �� ���� li�� ����.
			for(int i=0; i<movielist.size(); i++) {
				Element movie = movielist.get(i);
				// movielist �� arraylist �� �����. -> get(i)�� �ϳ��� �ҷ��´�.
				String tit = movie.select(".tit").select("span").text();
				if(tit.equals("")) tit = "��������";
				String title = movie.select(".tit").select("a").text();
				String score = movie.select(".star").select(".info_star").select(".num").text();
				String str = movie.select(".info_txt1").select("dd").text();
				String strImg_Url = movie.select(".thumb").select("img").attr("src");
				String imgName = strImg_Url.substring(strImg_Url.lastIndexOf("/")+1, strImg_Url.indexOf("?"));
				String ext = imgName.substring(imgName.indexOf("."));
				imgName = imgName.substring(0,imgName.indexOf("."))+ i + ext;
				System.out.println(imgName);
				downloadImage(imgName, strImg_Url);
				//System.out.println(tit + " //// " + title + " //// " + score + " //// " + str);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void downloadImage(String strImageName, String strImageUrl){
		try {
			URL urlImage = new URL(strImageUrl);
			InputStream in = urlImage.openStream();
			byte[] buffer = new byte[4096];
			int n = -1;
			OutputStream os = new FileOutputStream("images/" + strImageName);
			while((n = in.read(buffer)) != -1) {
				os.write(buffer,0,n);
			}
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
